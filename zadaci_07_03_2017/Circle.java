package zadaci_07_03_2017;

	class Circle {
		/** The radius of this circle */
		double radius = 1;
		/** Construct a circle object */
		Circle() {
		}
		/** Construct a circle object */
		Circle(double newRadius) {
			radius = newRadius;
		}
		/** Return the area of this circle */
		double getArea() {
			return radius * radius * Math.PI;
		}
		/** Return the perimeter of this circle */
		double getPerimeter() {
			return 2 * radius * Math.PI;
		}
		/** Set new radius for this circle */
		void setRadius(double newRadius) {
			radius = newRadius;
		}
		
		public String toString() {
			return "Circle with radius: " + radius;
		}
	}	
