import sys

def specify_triangle(x, y, z):
  try:
    x = int(x)
    y = int(y)
    z = int(z)
  except ValueError:
    return None
  
  if x <= 0 or y <= 0 or z <= 0:
    return None

  if x == y == z:
    return 'equilateral'
  elif x == y or x == z or y == z:
    return 'isosceles'
  elif x + y > z or x + z > y or z + y > x:
    return 'scalene'

if len(sys.argv) == 4:
  try:
    x = int(sys.argv[1])
    y = int(sys.argv[2])
    z = int(sys.argv[3])
    print(specify_triangle(x, y, z))
  except ValueError:
    print('Please give an integer value.')
    
