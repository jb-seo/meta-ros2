# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Example plugin for RViz - documents and tests RViz plugin development"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = " qtbase5-dev resource-retriever rviz-rendering"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/crystal/rviz_rendering_tests/5.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2f1df27036fd46a985b943c98a955fcc"
SRC_URI[sha256sum] = "a66b2482a4c5c7ab5fd51246a799b42855b7d406643a9c28e1eff45fbadeb3e1"
S = "${WORKDIR}/rviz-release-release-crystal-rviz_rendering_tests-5.1.0-0"

inherit ament
