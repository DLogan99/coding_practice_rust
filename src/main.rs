use std::io;
use std::io::{StdoutLock, Write};

fn main() {
	let mut input: String = String::new();
	let mut prime: u32 = 0;
	
	println!("This program will generate Prime numbers up to the number you entered.");
	io::stdin().read_line(&mut input).expect("Failed stdin.read_line.");
	
	let limit: u32 = loop {
		match input.trim().parse::<u32>() {
			Ok(num) => { break num; }
			Err(..) => {
				println!("Input is not an integer: {}", input);
				input.clear();
				println!("Enter a fucking number dipshit.\n");
				io::stdin().read_line(&mut input).unwrap();
			}
		}
	};
	
	while input.trim().parse::<u32>().unwrap() > prime {
		let mut sout: StdoutLock = io::stdout().lock();
		prime = pnp(prime + 1);
		// sout.write(&*(prime.to_string() + "\n").into_bytes()).unwrap();
		// sout.write(b"\n").unwrap();
		println!( "prime: {}", prime );
		sout.flush().unwrap();
	}
}

fn pnp (prior: u32) -> u32 {
	if is_prime(prior) { prior }
	else { pnp(prior + 1) }
}

fn is_prime(n: u32) -> bool {
	if n <= 2 { return true	}
	
	for  i in 2..n {
		if n%i == 0 { return false; }
	}
	
	true
}

fn print_type_of<T>(_: &T) {
	println!("{}", std::any::type_name::<T>());
}