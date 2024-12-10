use std::io;

fn main() {
    let mut input: String = String::new();
    let mut prime: u32 = 0;

    println!("This program will generate Prime numbers up to the number you entered.");

    let limit: u32 = loop {
        io::stdin().read_line(&mut input).expect("Failed stdin.read_line.");
        match input.trim().parse::<u32>() {
            Ok(num) => {
                break num;
            }
            Err(..) => {
                println!("Input is not an integer: {}", input);
                input.clear();
                println!("Enter a fucking number dipshit.\n");
            }
        }
    };

    while limit > prime {
        prime = pnp(prime + 1);
        println!("prime: {}", prime);
    }
}

fn pnp(prior: u32) -> u32 {
    if is_prime(prior) {
        prior
    } else {
        pnp(prior + 1)
    }
}

fn is_prime(n: u32) -> bool {
    if n <= 2 {
        return true;
    }

    for i in 2..n {
        if n % i == 0 {
            return false;
        }
    }

    true
}

// fn print_type_of<T>(_: &T) {
//     println!("{}", std::any::type_name::<T>());
// }
