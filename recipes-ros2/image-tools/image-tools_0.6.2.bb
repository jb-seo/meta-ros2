# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tools to capture and play back images to and from DDS subscriptions and publications."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake libopencv-dev rclcpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/crystal/image_tools/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0b930adf308009e402bd4382e17176ce"
SRC_URI[sha256sum] = "6b7323ff77c5f2a3770d94e85e1d925ba6b657f5fd0110a644230aba2ad04287"
S = "${WORKDIR}/demos-release-release-crystal-image_tools-0.6.2-0"

inherit catkin
