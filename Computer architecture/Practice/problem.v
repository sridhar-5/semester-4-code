module problem(
    input a,
    input b,
    output y
);

assign y = ((~a & ~b) | (a & ~b));
endmodule