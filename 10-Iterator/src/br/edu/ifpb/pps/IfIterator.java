package br.edu.ifpb.pps;

public interface IfIterator {
	void first();
	void next();
	boolean isDone();
	Canal current();
}
