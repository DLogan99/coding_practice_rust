//Enter a number and have the program generate the Fibonacci sequence to that number or to the Nth number.
use std::io::stdin;

fn main () {

	let mut cur: u128 = 1;
	let mut pri: u128 = 0;
	let mut inp = String::new();
	let mut iter: u16 = 1;

	println!("Please input a positive number:");
	stdin().read_line(&mut inp).unwrap();

	let mut n: u128 = inp.trim().parse::<u128>().expect("not a number");
		println!("input number: {}", inp);

	while n > cur {
		println!("{}", cur);
		cur = cur + pri;
		pri = cur - pri;
		// std::thread::sleep(std::time::Duration::from_secs(1));
		iter += 1;
	}
	println!("Iterations: {}", iter);
}