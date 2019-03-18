# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Minimal action client examples"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " example-interfaces rclcpp rclcpp-action"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/crystal/examples_rclcpp_minimal_action_client/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "84cea371b86a6356db034b8a0f40d505"
SRC_URI[sha256sum] = "59a394dd8c6ca4ed4a766c15f3fd65f90e68c60ad11d60b125bc8c3bc3def846"
S = "${WORKDIR}/examples-release-release-crystal-examples_rclcpp_minimal_action_client-0.6.2-0"

inherit ament
