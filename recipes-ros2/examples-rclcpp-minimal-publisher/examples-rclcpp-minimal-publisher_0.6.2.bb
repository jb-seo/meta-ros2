# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of minimal publisher nodes"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " rclcpp std-msgs"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/crystal/examples_rclcpp_minimal_publisher/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "80569188ec310034a2ae7a3bc9b8842b"
SRC_URI[sha256sum] = "1c40b508e3a24d40f38f26c37f1f987ea345c834d10b3dc126f9cccb11622d55"
S = "${WORKDIR}/examples-release-release-crystal-examples_rclcpp_minimal_publisher-0.6.2-0"

inherit ament
