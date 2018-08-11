# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common rviz API, used by rviz plugins and applications."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake geometry-msgs libqt5-core libqt5-gui libqt5-opengl libqt5-widgets pluginlib qtbase5-dev rclcpp resource-retriever rviz-assimp-vendor rviz-ogre-vendor rviz-rendering rviz-yaml-cpp-vendor sensor-msgs std-msgs tf2 tf2-geometry-msgs tf2-ros tinyxml-vendor urdf"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_common/4.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f4b342f4eb723ddd4696660bc93a2397"
SRC_URI[sha256sum] = "5a09d8c6ccbd61a24a8317547b8b0732f181f898ca2bb876cb1c034fabd5a731"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_common-4.0.1-0"

inherit catkin
