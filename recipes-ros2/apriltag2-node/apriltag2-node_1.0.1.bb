# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "AprilTag2 detection node"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "ament-cmake apriltag apriltag-msgs class-loader eigen rclcpp sensor-msgs tf2-msgs"
SRC_URI = "https://github.com/christianrauch/apriltag2_node-release/archive/release/crystal/apriltag2_node/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a644bf7e34c989ac26044884d6b105f6"
SRC_URI[sha256sum] = "096c7aba240c1767464228f85390ab0162b0443d470887944047d7b0b9e56f08"
S = "${WORKDIR}/apriltag2_node-release-release-crystal-apriltag2_node-1.0.1-0"

inherit catkin
