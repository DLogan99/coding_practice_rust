use std::io::{ stdin };

fn main () {
	let vals = get_val();
	let monthly: f32 = (vals[0] + (vals[0] * vals[2]/100.0250)) / vals[1];
	let total: f32 = vals[0] + (vals[0] * vals[2]/100.0);
	
	println!("The loan interest paid out will be: {}", vals[0] * vals[2]/100.0);
	println!("The monthly payment will be: {}", monthly);
	println!("The total payment will be: {}", total);
}

// Initiate getting the values for each variable in the equation.
fn get_val() -> Vec<f32> {
	let amount: f32 = ln_amt();
	let term: f32 = ln_tm();
	let rate: f32 = ln_ir();
	
	vec![amount, term, rate]
}

fn ln_amt () -> f32 {
	println!("What is the loan amount? (Format = 1234.56 - only enter numbers in dollar.cent format");
	
	get_input()
}
fn ln_tm () -> f32 {
	println!("What is the loan term in months?");
	
	get_input()
}
fn ln_ir () -> f32 {
	println!("What is the interest rate of the loan? (Format = 4.4 = 4.4%)");
	
	get_input()
}

fn get_input () -> f32 {
	loop {
		let mut input: String = String::new();
		stdin().read_line(&mut input).unwrap();
		let report = val_f32(&input);
		
		if report != 0.123 {
			return report
		} else {
			println!("Bad input {}", input);
			input.clear();
		}
	}
}

fn val_f32 (input: &String) -> f32 {
	match input.trim().parse::<f32>() {
		Ok(f) => {
			f
		}
		Err(_) => {
			0.123
		}
	}

use std::io;

fn main () {
	println!("This program will find PI to the nth digit, specified by you.");
	loop {
		println!("Please specify how many digits you want.");
		let limit: i32 = {
			let mut s = String::new();
			io::stdin().read_line(&mut s).unwrap();
			match s.trim().parse::<i32>() {
				Ok(n) => n,
				Err(e) => {
					println!("Bad input, exiting program now. Error: {}", e);
					std::process::exit(0);
				}
			}
		};
		println!("Your PI: {}", nth_digit(limit));
		println!("Another? Y or N");
		let mut input = String::new();
		io::stdin().read_line(&mut input).unwrap();
		if input.trim().to_lowercase() == "y" { continue }
		else { 
			println!("Thank you!");
			break 
		}
	}
}


fn nth_digit (n: i32) -> f64 {
	let mult: f64= 10.0_f64.powi(n-1);
	((std::f64::consts::PI * mult) as i128) as f64 / mult

}