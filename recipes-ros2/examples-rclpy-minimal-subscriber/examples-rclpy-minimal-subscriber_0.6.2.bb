# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of minimal subscribers using rclpy."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rclpy std-msgs"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/crystal/examples_rclpy_minimal_subscriber/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2392f9544b14cb42b4e595adc8cd8a82"
SRC_URI[sha256sum] = "15597826d77740ad46badaa2e278c09b3c66ed3de06cbb08aae7a6765c2772c9"
S = "${WORKDIR}/examples-release-release-crystal-examples_rclpy_minimal_subscriber-0.6.2-0"

inherit catkin
