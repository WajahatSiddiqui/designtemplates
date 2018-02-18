# designtemplates
Best code practices for various design

1. Equals design: [Date Class] (https://github.com/WajahatSiddiqui/designtemplates/blob/master/Designs/src/Date.java)
   * Optimization for null reference equality
   * Check against null
   * Check that two objects are of the same type and cast.
   * Compare against each field:
   	- if field is a primitive type use ==
	- if field is an object, use equals()
	- if field is an array, apply to each element
	Note: use Arrays.equals(a, b) or Array.deepEquals(a, b) but not a.equals(b)
