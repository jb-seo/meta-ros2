# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of minimal service clients"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake example-interfaces rclcpp"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/crystal/examples_rclcpp_minimal_client/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "55b99a6be70b3c319e8795af34c0dab7"
SRC_URI[sha256sum] = "7d1bca2d8ca01743d2a0a8c014811145559494818949ebe63837cc977c0b3063"
S = "${WORKDIR}/examples-release-release-crystal-examples_rclcpp_minimal_client-0.6.2-0"

inherit catkin
