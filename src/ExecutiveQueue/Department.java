package ExecutiveQueue;

import GroceryQueue.LinkedList;

public class Department
{
    String deptName;
    int size;
    int largestSize;

    public GroceryQueue.LinkedList<Executive> line;

    public Department(String inputName)
    {
        line = new LinkedList<Executive>();
        deptName = inputName;
        size = 0;
        largestSize = 0;
    }

    public void add(Executive inputExec)
    {
        line.add(inputExec);
        size++;
        if (size > largestSize)
        {
            largestSize = size;
        }
    }

    public Executive peek()
    {
        return line.getHead().getData();
    }

    public Executive poll()
    {
        Executive temp = line.getHead().getData();
        line.removeHead();
        size--;
        return temp;
    }

    public void print() {
        for (int i = 0; i < line.getSize(); i++)
        {
            System.out.print("[" + this.peek().toString() + "] ");
            this.add(this.poll());
        }
        System.out.println("\n");
    }

    public boolean find(Executive searchData) {
        boolean found = false;

        for (int i = 0; i < line.getSize(); i++)
        {
            if (this.peek() == searchData)
            {
                found = true;
            }
            this.add(this.poll());
        }

        return found;
    }

    public void insert(Executive data, int pos) {
        if (line.getSize() > pos)
        {
            for (int i = 0; i < pos; i++)
            {
                this.add(this.poll());
            }
            this.add(data);
            for (int i = pos; i < line.getSize() - 1; i++)
            {
                this.add(this.poll());
            }

        }
        else
        {
            this.add(data);
        }
    }

    public int size()
    {
        return size;
    }

    public int getLargestSize()
    {
        return largestSize;
    }

    public boolean hasNext()
    {
        return size != 0;
    }
}
