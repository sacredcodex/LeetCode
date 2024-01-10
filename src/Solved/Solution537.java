package Solved;

public class Solution537 {
	private class Complex{
		int real, imaginary;

		Complex(String str){
			int index1 = str.indexOf('+');
			int index2 = str.indexOf('i');
			real = Integer.parseInt(str.substring(0, index1));
			imaginary = Integer.parseInt(str.substring(index1 + 1, index2));
		}

		Complex(int real, int imaginary){
			this.real = real;
			this.imaginary = imaginary;
		}

		public Complex multiply(Complex b){
			return new Complex(real * b.real - imaginary * b .imaginary, real * b.imaginary + imaginary * b.real);
		}

		public String toString(){
			return String.valueOf(real) + '+' + String.valueOf(imaginary) + 'i';
		}
	}

	public String complexNumberMultiply(String num1, String num2) {
		return new Complex(num1).multiply(new Complex(num2)).toString();
	}
}
