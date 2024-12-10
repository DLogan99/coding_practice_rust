use std::io::{ stdin };

fn main () {
}

// Initiate getting the values for each variable in the equation.
fn getVal () -> Vec<f32> {
	let amount: f32 = ln_amt();
	let term: f32 = ln_tm();
	let rate: f32 = ln_ir();
	
	vec![amount, term, rate]
}

fn ln_amt () -> f32 {
	println!("What is the loan amount? (Format = 1234.56 - only enter numbers in dollar.cent format");
	let mut input = String::new();
	loop {
		stdin().read_line(&mut input).unwrap();
		if val_f32(input) {
			
		}
		input.clear();
	}
}
fn ln_tm () -> f32 {}
fn ln_ir () -> f32 {}

fn val_f32 (input: String) -> bool {
	match input.trim().parse::<f32>() {
		Ok(f) => {
			true
		}
		Err(_) => {
			false
		}
	}
}