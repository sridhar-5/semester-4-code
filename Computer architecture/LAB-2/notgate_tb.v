module notgate_tb();

reg a;
wire y;

notgate inotgate(a,y);
initial
begin 
    $monitor("a=%b,y=%b",a,y);
    $dumpfile("not.vcd");
    $dumpvars(0,notgate_tb);
    a = 0;#10;
    a = 1;#10;
end
endmodule