# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Demonstrations of intra process communication."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " libopencv-dev rclcpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/crystal/intra_process_demo/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8f74ccdf899a982352578460124ee21b"
SRC_URI[sha256sum] = "f40ccb7be71f24b0b87300e5198f3e721aa99a537c8cee8b3ee707bee901fbc9"
S = "${WORKDIR}/demos-release-release-crystal-intra_process_demo-0.6.2-0"

inherit ament
