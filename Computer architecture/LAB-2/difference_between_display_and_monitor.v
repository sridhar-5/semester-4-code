module monitor_display(
    input a,
    input b,
    output y
);


xnor x1(y,a,b);
endmodule