# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Minimalist examples of composing nodes in the same   process"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " class-loader rclcpp std-msgs"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/crystal/examples_rclcpp_minimal_composition/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a6df9cfd1716ffb7d9accef25421ee10"
SRC_URI[sha256sum] = "982533fa95d8c18370c536ceeb1947085cdf0c351b7e56f4df0b157b32b97463"
S = "${WORKDIR}/examples-release-release-crystal-examples_rclcpp_minimal_composition-0.6.2-0"

inherit ament
