/*
 * @author Dongmin.lee
 * @since 2023-03-28
 * @version 23.03.28
 * @see <pre>
 *  Copyright (C) 2007 by 313 DEV GRP, Inc - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by 313 developer group <313@313.co.kr>, December 2010
 * </pre>
 */
package com.arms.reqreviewcommentlog.controller;

import com.arms.reqreviewcomment.model.ReqReviewCommentEntity;
import com.arms.reqreviewcommentlog.model.ReqReviewCommentLogDTO;
import com.egovframework.javaservice.treeframework.controller.TreeAbstractController;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

import com.arms.reqreviewcommentlog.model.ReqReviewCommentLogEntity;
import com.arms.reqreviewcommentlog.service.ReqReviewCommentLog;

@Slf4j
@Controller
@RequestMapping(value = {"/arms/reqReviewCommentLog"})
public class ReqReviewCommentLogController extends TreeAbstractController<ReqReviewCommentLog, ReqReviewCommentLogDTO, ReqReviewCommentLogEntity> {

    @Autowired
    @Qualifier("reqReviewCommentLog")
    private ReqReviewCommentLog reqReviewCommentLog;

    @PostConstruct
    public void initialize() {
        setTreeService(reqReviewCommentLog);
        setTreeEntity(ReqReviewCommentLogEntity.class);
    }

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

}
