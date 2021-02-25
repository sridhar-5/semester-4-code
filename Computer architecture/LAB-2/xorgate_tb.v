module xorgate_tb();

reg a;
reg b;
wire y;

xorgate verify(a,b,y);
initial 
begin
     $monitor("a=%b,b=%b,y=%b",a,b,y);
     $dumpfile("xor.vcd");
     $dumpvars(0,xorgate_tb);
     a = 0;b = 0;
     a = 0;b = 1;
     a = 1;b = 0;
     a = 1;b = 1;
end 
endmodule 


