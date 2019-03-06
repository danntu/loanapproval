package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class ProcessRequestDelegate implements JavaDelegate {
    private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS");

    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info("Process request by " + delegateExecution.getVariable("customerId"));
        LOGGER.info("Amount is " + delegateExecution.getVariable("amount"));
    }
}
