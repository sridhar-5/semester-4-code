module orgate_tb();
reg a;
reg b;
wire y;

orgate iorgate(a, b, y);
initial
begin
    $monitor("a=%b,b=%b,y=%b",a, b, y);
    $dumpfile("or.vcd");
    $dumpvars(0,orgate_tb);
    a = 0;b = 0;#10;
    a = 0;b = 1;#10;
    a = 1;b = 0;#10;
    a = 1;b = 1;#10;
    $finish;
end
endmodule
