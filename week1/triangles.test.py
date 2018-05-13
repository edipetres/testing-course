import unittest
from triangles import specify_triangle

class TestStringMethods(unittest.TestCase):

  def test_scalene(self):
    self.assertEqual(specify_triangle(1, 2, 3), 'scalene')

  def test_isosceles(self):
    self.assertEqual(specify_triangle(1, 1, 2), 'isosceles')
  
  def test_equilateral(self):
    self.assertEqual(specify_triangle(5, 5, 5), 'equilateral')

  def test_string_input_val(self):
    self.assertEqual(specify_triangle(1, 2, 'm'), None)

  def test_zero_val(self):
    self.assertEqual(specify_triangle(1, 2, 0), None)

  def test_negative_val(self):
    self.assertEqual(specify_triangle(1, 5, -2), None)
  
  def test_negative_zero_vals(self):
    self.assertEqual(specify_triangle(1, 0, -1), None)

  def test_large_side(self):
    self.assertEqual(specify_triangle(5, 200, 1), None)

if __name__ == '__main__':
    unittest.main()