package net.bioclipse.jobs;

import net.bioclipse.core.api.jobs.IReturner;

/**
 * @author jonalv
 */
public class BioclipseJobUpdateHook<T> implements IReturner<T> {

    private String jobName;
    
    public BioclipseJobUpdateHook(String jobName) {
        this.jobName = jobName;
    }

    public String getJobName() {
        return jobName;
    }
    
    public void partialReturn( T chunk ) {
    }

    public void completeReturn( T object ) {
    }
}