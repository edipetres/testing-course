import sys

def specify_triangle(x, y, z):
  if x == y == x:
    return 'equilateral'
  elif x == y or x == z or y == z:
    return 'isosceles'
  else:
    return 'scalene'

if len(sys.argv) == 4:
  try:
    x = int(sys.argv[1])
    y = int(sys.argv[2])
    z = int(sys.argv[3])
    print(specify_triangle(x, y, z))
  except ValueError:
    print('Please give an integer value.')
    
