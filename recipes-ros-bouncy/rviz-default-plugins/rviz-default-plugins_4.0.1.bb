# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Several default plugins for rviz to cover the basic functionality."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake geometry-msgs laser-geometry libqt5-core libqt5-gui libqt5-opengl libqt5-widgets map-msgs nav-msgs pluginlib qtbase5-dev rclcpp resource-retriever rviz-common rviz-rendering tinyxml-vendor urdf visualization-msgs"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_default_plugins/4.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "96bd79365142bf04662e77029a4ec8fd"
SRC_URI[sha256sum] = "f178883f75e1d98d0eacb6d16e91bb281c4db5f36f6ad326cf0d272cafc3107f"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_default_plugins-4.0.1-0"

inherit catkin
