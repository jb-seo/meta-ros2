# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The costmap_queue package"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake boost nav2-costmap-2d rclcpp"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/costmap_queue/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7bc14ccfe10edd62ca3fe10aaa7dc0b1"
SRC_URI[sha256sum] = "fceed07ee141c18d6b295198d26ad8b6fc136ba867ac249cea8598f02ed67400"
S = "${WORKDIR}/navigation2-release-release-crystal-costmap_queue-0.1.5-0"

inherit catkin
