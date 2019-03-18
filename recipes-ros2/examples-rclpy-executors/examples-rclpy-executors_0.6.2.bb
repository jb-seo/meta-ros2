# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of creating and using exectors to run multiple nodes in the same process"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rclpy std-msgs"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/crystal/examples_rclpy_executors/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "040da1b2cc1308d82c57cb1a311d9f4c"
SRC_URI[sha256sum] = "499ef4d67813027be230e61157fed957f31a90077ab0c61afa34304437f9962c"
S = "${WORKDIR}/examples-release-release-crystal-examples_rclpy_executors-0.6.2-0"

inherit ament
