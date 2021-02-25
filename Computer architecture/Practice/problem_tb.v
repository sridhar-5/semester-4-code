module problem_tb();
reg a;
reg b;
wire y;

problem ipro(a, b, y);
initial
begin
    $monitor("a=%b, b=%b,y=%b",a,b,y);
    $dumpfile("problem.vcd");
    $dumpvars(0,problem_tb);
    a = 0;b = 0;#10;
    a = 0;b = 1;#10;
    a = 1;b = 0;#10;
    a = 1;b = 1;#10;
    $finish;
end
endmodule 