function calculate_pi(n)
    counter = 0
    for i = 0:n
        x = rand()
        y = rand()
        if x * x + y * y < 1
            counter += 1
        end
    end
    return 4 * counter / n
end


function main()
    number_of_itteration = 1_000_000
    println(calculate_pi(number_of_itteration))
end

main()