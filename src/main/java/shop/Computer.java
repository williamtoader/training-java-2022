package shop;

enum CPU{
	I3,I5,I7
}

public class Computer {

    CPU processor;
    int ram;

    public Computer(CPU processor, int ram) {
    	this.processor = processor;
    	this.ram = ram;
    }
}
