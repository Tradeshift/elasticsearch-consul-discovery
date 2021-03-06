/*
These files were modified by Lithium Technologies, Inc. and all such modifications are:
Copyright © 2015 Lithium Technologies, Inc. All rights reserved subject to the terms of the MIT License below.
Original files from the “Elasticsearch SRV discovery plugin” project, prior to modification by Lithium, are:
Copyright (c) 2015 Grant Rodgers
MIT License
Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package org.elasticsearch.discovery.consul;

import org.elasticsearch.common.inject.AbstractModule;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.logging.ESLogger;
import org.elasticsearch.common.logging.Loggers;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.ElasticsearchException;

public class ConsulDiscoveryModule extends AbstractModule {
	protected final ESLogger logger;
	private Settings settings;

	@Inject
	public ConsulDiscoveryModule(Settings settings) {
		this.settings = settings;
		this.logger = Loggers.getLogger(getClass(), settings);
	}

	@Override
	protected void configure() {
		logger.debug("starting consul services");
	}
}
