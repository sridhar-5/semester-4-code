module monitor_display_tb();
reg a;
reg b;
wire y;

 

monitor_display imonitor_display(a, b, y);
initial
begin
    $display("a=%b, b=%b, y=%b",a,b,y);
    $monitor("a=%b, b=%b, y=%b",a,b,y);
    $dumpfile("and.vcd");
    $dumpvars(0,monitor_display_tb);
    a = 0;b = 0;#10;
    a = 0;b = 1;#10;
    a = 1;b = 0;#10;
    a = 1;b = 1;#10;
    $finish;
end
endmodule