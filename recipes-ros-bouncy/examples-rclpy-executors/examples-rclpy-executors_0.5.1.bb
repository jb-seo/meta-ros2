# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of creating and using exectors to run multiple nodes in the same process"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rclpy std-msgs"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/bouncy/examples_rclpy_executors/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0072658565bc958015e0ef0d701e2ad0"
SRC_URI[sha256sum] = "4620789b5fa7810409d651eff05b4127d6b5cf33a181f14a24f136a7915c94f3"
S = "${WORKDIR}/examples-release-release-bouncy-examples_rclpy_executors-0.5.1-0"

inherit ros
inherit setuptools3


