module nandgate_tb();

reg a;
reg b;
wire y;

nandgate verifynand(a,b,y);
initial 
begin 
     $monitor("a=%b,b=%b,y=%b",a,b,y);
     $dumpfile("nand.vcd");
     $dumpvars(0,nandgate_tb);
     a = 0;b = 0;#10;
     a = 0;b = 1;#10;
     a = 1;b = 0;#10;
     a = 1;b = 1;#10;
end 
endmodule 