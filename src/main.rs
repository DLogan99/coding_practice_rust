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