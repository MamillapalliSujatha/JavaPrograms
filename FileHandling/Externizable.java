package com.FileHandling;

import java.io.*;

class Car implements Externalizable {
		static int age;
		String name;
		int year;

		public Car()
		{
			System.out.println("Default Constructor called");
		}

		Car(String n, int y)
		{
			this.name = n;
			this.year = y;
			age = 20;
		}

		@Override
		public void writeExternal(ObjectOutput out)
			throws IOException
		{
			out.writeObject(name);
			out.writeInt(age);
			out.writeInt(year);
		}

		@Override
		public void readExternal(ObjectInput in)
			throws IOException, ClassNotFoundException
		{
			name = (String)in.readObject();
			year = in.readInt();
			age = in.readInt();
		}

		@Override public String toString()
		{
			return ("Name: " + name + "\n"
					+ "Year: " + year + "\n"
					+ "Age: " + age);
		}
	}

	public class Externizable {
		public static void main(String[] args)
		{
			Car car = new Car("Sujatha", 2001);
			Car newcar = null;
			try {
				FileOutputStream fo
					= new FileOutputStream("file2.txt");
				ObjectOutputStream so
					= new ObjectOutputStream(fo);
				so.writeObject(car);
				so.flush();
			}
			catch (Exception e) {
				System.out.println(e);
			}

			try {
				FileInputStream fi
					= new FileInputStream("file2.txt");
				ObjectInputStream si
					= new ObjectInputStream(fi);
				newcar = (Car)si.readObject();
			}
			catch (Exception e) {
				System.out.println(e);
			}

			System.out.println("The original car is:\n" + car);
			System.out.println("The new car is:\n" + newcar);
		}
	}



