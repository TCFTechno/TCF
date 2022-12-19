package Collections;

import java.util.ArrayList;

public class AraayList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		// add() = to add value into arraylist we use add method
		list.add("suresh");
		list.add("madhavan");
		list.add("vignesh");

		System.out.println(list);
		System.out.println("============================");

		// get() = passing index value we can get the array list value

		String string = list.get(1);

		System.out.println(string);

		System.out.println("============================");

		// size() = it will get the length of the ararylist

		int size = list.size();

		System.out.println(size);

		System.out.println("============================");

		// remove() = by passing the index
		list.remove(0);

		System.out.println(list);

		// set() = by passing the existing index value we can upadte the value

		System.out.println("============================");

		list.set(1, "tcf");

		System.out.println(list);

		System.out.println("============================");
		// contains() = it will check the values present in arraylist or not

		boolean contains = list.contains("tcf");

		System.out.println(contains);
		System.out.println("============================");

		// indexof()= using this method we can get the index position of the value.

		int indexOf = list.indexOf("tcf");

		System.out.println(indexOf);

		System.out.println("============================");
		// addall() == using addall() we can copy all the value into another arraylist

		ArrayList<String> list1 = new ArrayList<String>();

		list1.addAll(list);

		System.out.println(list1);
		System.out.println("============================");

		// removeall() == it is used to compare the both list and remove the duplicate
		// value in lisst

		ArrayList<String> list2 = new ArrayList<String>();

		list2.add("madhavan");
		list2.add("babu");

		list2.removeAll(list);

		System.out.println(list2);
		System.out.println("============================");

		// retainall()= it wil compare 2 arraylist and print the commaon value

		ArrayList<String> list3 = new ArrayList<String>();

		list3.add("babu");
		list3.add("hellow");
		list3.add("welcome");

		list3.retainAll(list2);

		System.out.println(list3);
		System.out.println("============================");

		// clear() = it wil clear all the Arraylist value

		list3.clear();
		System.out.println(list3);
	}
}