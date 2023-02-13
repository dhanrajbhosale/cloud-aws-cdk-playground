#!/usr/bin/env node
import * as cdk from 'aws-cdk-lib';
import { MyFirstCdkAppStack } from '../lib/my-first-cdk-app-stack';

const app = new cdk.App();
new MyFirstCdkAppStack(app, 'MyFirstCdkAppStack');
