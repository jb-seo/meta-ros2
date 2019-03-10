# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Minimal action server examples"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake example-interfaces rclcpp rclcpp-action"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/crystal/examples_rclcpp_minimal_action_server/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "24c05ca03455ff4641647437cedc0972"
SRC_URI[sha256sum] = "bb1d8d4667b9acd29965f9f59027bdd5cd7e07779fab04960139cb4ed7733a80"
S = "${WORKDIR}/examples-release-release-crystal-examples_rclcpp_minimal_action_server-0.6.2-0"

inherit catkin
