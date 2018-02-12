import triangles

res = triangles.specify_triangle(1,2,3)
assert(res == 'scalene')

res = triangles.specify_triangle(1,1,2)
assert(res == 'isosceles')

res = triangles.specify_triangle(5, 5, 5)
assert(res == 'equilateral')

res = triangles.specify_triangle(1, 2, 'm')
assert(res == None)

res = triangles.specify_triangle(1, 2, 0)
assert(res == None)

res = triangles.specify_triangle(1, 0, -1)
assert(res == None)