package de.plushnikov.intellij.plugin.processor.clazz.log;

import lombok.extern.elog.ELog;

/**
 * Created by andy on 6/15/16.
 */
public class ELogProcessor extends AbstractLogProcessor {

    private static final String LOGGER_TYPE = "me.ele.elog.Log";
    private static final String LOGGER_CATEGORY = "%s.class";
    private static final String LOGGER_INITIALIZER = "me.ele.elog.LogFactory.getLogger(%s)";


    public ELogProcessor() {
        super(ELog.class, LOGGER_TYPE, LOGGER_INITIALIZER, LOGGER_CATEGORY);
    }

}
