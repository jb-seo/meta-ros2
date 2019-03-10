# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A minimal service server which adds two numbers"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake example-interfaces rclcpp"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/crystal/examples_rclcpp_minimal_service/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f7b475f06fd16fb63cf399a7b2673d63"
SRC_URI[sha256sum] = "66e4520771b68aed9fbbacf5ae17196740456f094920a1b414be271c229d43ce"
S = "${WORKDIR}/examples-release-release-crystal-examples_rclcpp_minimal_service-0.6.2-0"

inherit catkin
