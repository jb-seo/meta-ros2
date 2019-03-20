# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Example plugin for RViz - documents and tests RViz plugin development"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "resource-retriever rviz-rendering qtbase5-dev"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_rendering_tests/4.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ee4c1cfa3a56c965a3290dffa4c103b4"
SRC_URI[sha256sum] = "7eaa51dc42eaecb74db32950c02dc9b01732a5ed62a9b31fefcc3cbc7abbfe7b"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_rendering_tests-4.0.2-0"


inherit ros
inherit ament

