# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS-independent package for logging that seamlessly pipes into rosconsole/rosout for ROS-dependent packages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "cmake"
SRC_URI = "https://github.com/ros2-gbp/console_bridge-release/archive/release/bouncy/console_bridge/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "508bb295be696e857fa59fad33054257"
SRC_URI[sha256sum] = "171f0c10897a1de2d0ab0e797d3fdc92f9acdb846b3fa79867529a7006a60f49"
S = "${WORKDIR}/console_bridge-release-release-bouncy-console_bridge-0.4.0-0"


inherit ros
inherit cmake

