# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Example plugin for RViz - documents and tests RViz plugin development"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "ament-cmake qtbase5-dev resource-retriever rviz-rendering"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_rendering_tests/4.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4750be0b922965d15c7e64e70f5eacc1"
SRC_URI[sha256sum] = "d3a3e8420857f3071568860168fedef4317e039d81d605be850821a0bf3f10f4"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_rendering_tests-4.0.1-0"

inherit catkin
