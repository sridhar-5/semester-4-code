module fa_ha_tb();

reg a;
reg b;
reg c;

wire sum;
wire carry;

fa_using_ha verify(a,b,c,sum,carry);

initial
begin
     $monitor("a=%b, b=%b, c=%b, sum=%b, carry=%b", a, b, c, sum, carry);
     $dumpfile("fa_using_ha.vcd");
     $dumpvars(0,fa_ha_tb);
     a = 0;b = 0;c = 0;#10;
     a = 0;b = 0;c = 1;#10;
     a = 0;b = 1;c = 0;#10;
     a = 0;b = 1;c = 1;#10;
     a = 1;b = 0;c = 0;#10;
     a = 1;b = 0;c = 1;#10;
     a = 1;b = 1;c = 0;#10;
     a = 1;b = 1;c = 1;#10;
end
endmodule
