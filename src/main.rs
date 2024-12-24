//Enter a number and have the program generate the Fibonacci sequence to that number or to the Nth number.
use std::io::stdin;

fn main () {

	let mut cur = 0;
	let mut pri = 0;
	let mut inp = String::new();

	stdin().read_line(&mut inp).unwrap();

	let mut n = inp.trim().parse::<u32>().expect("not a number");

	while n < i {
		println!("{}", cur);
		cur = cur + pri;
		pri = cur - pri;
	}

}