// Karma configuration file, see link for more information
// https://karma-runner.github.io/1.0/config/configuration-file.html

module.exports = function (config) {
  config.set({
    basePath: '',
    // frameworks: ['jasmine', '@angular-devkit/build-angular'],
    frameworks: ['mocha', 'sinon', 'chai', '@angular-devkit/build-angular'],
    plugins: [
      // require('karma-jasmine'),
      require('karma-mocha'),
      require('karma-sinon'),
      require('karma-chai'),
      require('karma-chrome-launcher'),
      // require('karma-jasmine-html-reporter'),
      require('karma-mocha-reporter'),
      require('karma-coverage'),
      require('@angular-devkit/build-angular/plugins/karma')
    ],
    client: {
      chai: {
        includeStack: true
    },
    mocha: {
        reporter: 'html',
        ui: 'bdd'
    }
      // clearContext: false // leave Jasmine Spec Runner output visible in browser
    },
    // jasmineHtmlReporter: {
    //   suppressAll: true // removes the duplicated traces
    // },
    coverageReporter: {
      dir: require('path').join(__dirname, './coverage/testing-demo'),
      subdir: '.',
      reporters: [
        { type: 'html' },
        { type: 'text-summary' }
      ]
    },
    // reporters: ['progress', 'kjhtml'],
    reporters: ['progress', 'mocha'],
    port: 9876,
    colors: true,
    logLevel: config.LOG_INFO,
    autoWatch: true,
    browsers: ['Chrome'],
    singleRun: false,
    restartOnFileChange: true
  });
};
