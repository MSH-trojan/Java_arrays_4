package main;

import java.util.Random;

public class Main{

public static void main(String[] args){

int[] List = new int[20];

Random v = new Random();

	System.out.print("Our arrays is: {");

for(int i =0; List.length >i ; i++) {
	
List[i] = v.nextInt(1000) +1;
	
	System.out.print(List[i]);
	
if(List.length - 1 > i) {
	System.out.print(", ");
			
}}

	System.out.println("}");

int max = List[0];
int min = List[0];


for(int i =0; i < List.length; i++){
	
if(List[i] < min){
	
min = List[i];

}}

	System.out.println();

	System.out.print("Smallest number in our array is: " + min);

	System.out.println();

for(int i =0; i<List.length; i++){
	
if(List[i] > max){

max = List[i];

}}
	
	System.out.println();

	System.out.print("Biggest number in our array is: " + max);
	
	System.out.println();

double AVG = 0;
double total = 0;

for(int i =0; i<List.length; i++){
	
	total += List[i];
	
}

	AVG = total / List.length;
	
	System.out.println();

	System.out.print("The Average of our array of numbers: " + AVG);

}}